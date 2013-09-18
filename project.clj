(defproject okapi-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :okapi {:xliff {:to {}
                  :from {}}
          :convert {:tmx {:filter "okf_plaintext_regex_sentences"
                          :srclang "en"
                          :tgtlang "fr"
                          :output :all
                          :copy true}
                    ;; tikal -2tmx data/gettysburg.txt -fc okf_plaintext_regex_sentences.fprm -tl FR -sl EN -trgsource
                    }
          }
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:plugins [[lein-okapi "0.1.0-SNAPSHOT"]]}})
