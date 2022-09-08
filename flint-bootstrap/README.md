## NEEDED EXTENSIONS
### Live Sass Compiler:
 1. Go to the extension settings
 2. On the formats section click "edit in settings.json"
 3. Paste this:
           
           
           {
                "emmet.includeLanguages": {
                    "javascript": "javascriptreact"
                },
                "editor.suggestSelection": "first",
                "vsintellicode.modify.editor.suggestSelection": "automaticallyOverrodeDefaultValue",
                "workbench.colorTheme": "One Dark Pro",
                "workbench.iconTheme": "material-icon-theme",
                "editor.defaultFormatter": "esbenp.prettier-vscode",
                "javascript.updateImportsOnFileMove.enabled": "always",
                "liveSassCompile.settings.formats": [
                    {
                        "format": "expanded",
                        "extensionName": ".css",
                        "savePath": "/dist/css"
                    }
                ]
            }
            
            
 4. Open scss/style.scss and Watch Sass.
 5. It should be ready to go.
### Live Server
