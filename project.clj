(defproject devth/slack-rtm "0.1.0-SNAPSHOT"
  :description "Slack Real Time Messaging API for Clojure"
  :url "https://github.com/devth/slack-rtm"
  :lein-release {:deploy-via :clojars}
  :deploy-repositories [["releases" :clojars]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.julienxx/clj-slack "0.4.2"]
                 [org.clojure/data.json "0.2.5"]
                 [stylefruits/gniazdo "0.3.1"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]])
