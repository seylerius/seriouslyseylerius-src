[:site-title "Seriously, Seylerius"
 :site-description "Analysis & research in tech, politics & activism"
 :site-url "http://www.seriouslyseylerius.com"
 :in-dir "resources/"
 :out-dir "../seriouslyseylerius-html/"
 :default-template "default.clj"
 :encoding "UTF-8"
 :blog-as-index false
 :create-archives false
 :atomic-build false
 :emacs "/usr/bin/emacs"
 :emacs-eval [(setq org-export-babel-evaluate nil)
              (global-font-lock-mode 1)
              (setq org-export-with-section-numbers nil)
              (set-face-foreground 'font-lock-string-face "#afafff")
              (set-face-foreground 'font-lock-keyword-face "#ff5f00")
              (set-face-foreground 'font-lock-function-name-face "#d7af00")
              (set-face-foreground 'font-lock-builtin-face "#afd700")
              (set-face-foreground 'font-lock-comment-face "#008787")]]
