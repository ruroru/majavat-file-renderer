(ns jj.majavat.renderer.file-renderer-test
  (:require [clojure.test :refer :all]
            [jj.majavat.renderer.file-renderer :as fr]))

(deftest file-renderer-writes-to-file
  (let [tmp-dir (System/getProperty "java.io.tmpdir")]
    (let [file (fr/render-file "template" {:bar "bar"} (format "%s/target/foo/bar/baz/file.txt" tmp-dir))]
      (is (= "foobarbaz" (slurp file))))))
