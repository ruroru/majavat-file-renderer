(defproject org.clojars.jj/majavat-file-renderer "1.0.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}

  :deploy-repositories [["clojars" {:url      "https://repo.clojars.org"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass}]]

  :dependencies [[org.clojure/clojure "1.12.3"]
                 [org.clojars.jj/majavat "1.12.2"]]

  :profiles {:test {:global-vars    {*warn-on-reflection* true}
                    :dependencies   [[ch.qos.logback/logback-classic "1.5.19"]]
                    :resource-paths ["test/resources"]}}

  :plugins [[org.clojars.jj/bump "1.0.4"]
            [lein-ancient "0.7.0"]
            [org.clojars.jj/strict-check "1.1.0"]
            [org.clojars.jj/bump-md "1.1.0"]]

  )
