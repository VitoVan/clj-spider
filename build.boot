(set-env!
 :source-paths #{"src"}
 :dependencies '[[enlive "1.1.6"]])

(task-options!
 pom {:project 'my-project
      :version "0.1.0"}
 jar)
