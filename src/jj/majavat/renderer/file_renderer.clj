(ns jj.majavat.renderer.file-renderer
  (:require [clojure.java.io :as io]
            [jj.majavat.renderer :refer [->InputStreamRenderer Renderer render]])
  (:import (java.io File InputStream)))

(defrecord FileRenderer [file-path config]
  Renderer
  (render [this template context]
    (let [^File output-file (io/file file-path)
          stream-renderer (->InputStreamRenderer (:config this))
          ^InputStream content-stream (render stream-renderer template context)]

      (io/make-parents output-file)

      (with-open [in content-stream
                  out (io/output-stream output-file)]
        (io/copy in out))
      output-file)))