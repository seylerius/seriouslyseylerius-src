{:title "Research and Analysis"}

(vec (concat [:dl {:class "posts"}]
             (vec (apply concat
                         (map
                          #(let [f %
                                 url (str "/writeups/" (first (clojure.string/split
                                                               (last (clojure.string/split (str f) #"/")) #"\."))
                                          ".html")
                                 [metadata _] (static.io/read-doc f)
                                 date (static.core/parse-date
                                       "yyyy-MM-dd" "yyyy|MMM|dd"
                                       (str (:date metadata)))]
                             [[:dt [:span date] [:a {:href url} (:title metadata)]]
                              [:dd (:summary metadata)]])
                          (sort-by #(-> %
                                        static.io/read-doc
                                        first
                                        :date
                                        str)
                                   (static.io/list-files :writeups)))))))
