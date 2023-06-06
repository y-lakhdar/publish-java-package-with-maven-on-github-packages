// Syncs the version from the pom.xml file with the one in package.json

import { spawnSync } from 'node:child_process';
import pjson from './package.json' assert { type: 'json' };

spawnSync('mvn', ['versions:set', `-DnewVersion=${pjson.version}`, '-DgenerateBackupPoms=false']);
