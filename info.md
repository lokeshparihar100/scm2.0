# Tailwind
initialize npm in project. it will create package.json
``` npm init -y ```

install tailwind in project
``` npm install -D tailwindcss ```

initialize Tailwind in project. It will create tailwind.config.js
``` npx tailwindcss init ```

Update tailwind.config.js with path './src/main/resources/**/*.{html,js}' to apply the css.
Add darkMode: "selector" to enable dark mode 

Create tailwind input file in 'src/main/resources/static/css/input.css'

create out file for tailwind. 
-i <input css file name> :path of input css file
-o <output css file name> :path of output css file
--watch :it will auto configure if any html/css changes done in specifiled path i.e. "./src/main/resources/**/*.{html,js}"
```npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch```

note: we need to run this command everytime when we open project.

# Flowbite
Add CDN of flowbite from https://flowbite.com/docs/getting-started/quickstart/#include-via-cdn

