(ns script-example.main
  (:require [clojure.test.check :as tc]
            [clojure.test.check.properties :as tc.props]
            [clojure.spec.test.alpha :as spec.test]))

(defn ^:export main []
  (spec.test/check))
