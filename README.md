# brain-dump

A Clojure library designed to help move your notes to [Roam Research](https://roamresearch.com).

brain-dump will extract all your page titles and linked references and automatically link the notes you want to move to Roam

## Usage

**Download instructions:**

1. `git clone https://github.com/Bardia95/brain-dump.git`

2. `cd brain-dump`

3. Export your Roam database to JSON like so:

4. ![Export All Demo](resources/Export-All-Roam-Demo.gif)

5. Save/move the JSON to the brain-dump root project directory.

6. Put in any files you want to convert into the input-notes directory.

7. Run this in your terminal:

`lein run "YOUR_ROAM_DIRECTORY.json"`

_Make sure to replace "YOUR_ROAM_DIRECTORY.json" with the name of your roam directory file._

_The updated files will be inside the roamified-notes directory._

8. Import your new Roamified notes to Roam like so:

![Import Files Demo](resources/Import-Files-Roam-Demo.gif)

## Dependencies

`java`
`jvm`
`clojure`
`leiningen`

## License

Copyright © 2020 The Periculum Erudition Corporation

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
