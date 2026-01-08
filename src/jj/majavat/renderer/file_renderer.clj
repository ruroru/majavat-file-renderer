(ns jj.majavat.renderer.file-renderer
  (:require [clojure.java.io :as io]
            [jj.majavat :as majavat]
            [jj.majavat.renderer :refer [->InputStreamRenderer Renderer render]])
  (:import (java.io File InputStream)))

(defrecord FileRenderer [output-file-path]
  Renderer
  (render [this template context sanitizer]
    (let [^File output-file (io/file output-file-path)

          stream-renderer (->InputStreamRenderer)
          ^InputStream content-stream (render stream-renderer template context sanitizer)]

      (io/make-parents output-file)

      (with-open [in content-stream
                  out (io/output-stream output-file)]
        (io/copy in out))
      output-file)))

(defn render-file [template-path context output-file-path]
  (let [render-fn (majavat/build-renderer template-path {:renderer (->FileRenderer output-file-path)})]
    (render-fn context)))
