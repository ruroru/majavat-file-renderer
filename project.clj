(defproject org.clojars.jj/majavat-file-renderer "1.0.2-SNAPSHOT"
  :description "Majavat file renderer is an extension for Majavat templating engine to save output in a file.\n"
  :url "https://github.com/ruroru/majavat-file-renderer"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}

  :deploy-repositories [["clojars" {:url      "https://repo.clojars.org"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass}]]

  :dependencies [[org.clojure/clojure "1.12.4"]
                 [org.clojars.jj/majavat "1.13.1"]]

  :profiles {:test {:global-vars    {*warn-on-reflection* true}
                    :dependencies   [[ch.qos.logback/logback-classic "1.5.22"]]
                    :resource-paths ["test/resources"]}}

  :plugins [[org.clojars.jj/bump "1.0.4"]
            [org.clojars.jj/strict-check "1.1.0"]
            [org.clojars.jj/bump-md "1.1.0"]]

  )
