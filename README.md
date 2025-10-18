# majavat-file-renderer
Majavat file renderer is an extension for Majavat templating engine that allows storing compiled template in a file ona  file system

## Installaiton


Add majavat to dependency list

```clojure
[org.clojars.jj/majavat-file-renderer "1.0.0"]
```

## Usage

given `input-file`
```
foo-{{bar}}-baz
```
```clojure
(def  render-fn (majavat/render "input-file" {:renderer (->FileRenderer "./expected/file.txt" {})}))
(render-fn {:bar "qaz"}) ;; writes  foo-qaz-baz to "./expected/file.txt"
```

## License

Copyright © 2025 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
