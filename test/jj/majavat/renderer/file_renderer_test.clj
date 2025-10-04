(ns jj.majavat.renderer.file-renderer-test
  (:require [clojure.test :refer :all]
            [jj.majavat.renderer.file-renderer :refer [->FileRenderer]]
            [jj.majavat :as majavat]))

(deftest file-renderer-writes-to-file
  (let [tmp-dir (System/getProperty "java.io.tmpdir")
        renderer-fn (majavat/build-renderer "template" {:renderer (->FileRenderer (format "%s/target/foo/bar/baz/file.txt" tmp-dir) {})})]
    (let [file (renderer-fn {:bar "bar"})]
      (is (= "foobarbaz" (slurp file))))))
