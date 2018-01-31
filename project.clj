(defproject prolin "0.1.4"
  :description "A linear programming library for Clojure (forked from Levand)"
  :url "http://github.com/claj/prolin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.apache.commons/commons-math3 "3.6.1"]]
  :profiles {:test {:dependencies [[org.clojure/test.generative "0.5.2"]]}}
  :aliases {"generative" ["with-profile" "test" "run" "-m" "clojure.test.generative.runner" "test"]}
  :jvm-opts ^:replace ["-Dclojure.test.generative.msec=30000"])
