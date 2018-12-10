# toffee-box

[![Build Status][travis-image]][travis]
[![Release][release-image]][releases]

Testing automated deployment with Travis.

- [x] Commits to any branch should trigger `sbt test`.
- [x] Tagged commits should trigger `./deploy.sh` and upload the `jar` to S3.

Lesson learned: encrypt secrets with the `--pro` flag or you're fucked.

[travis-image]: https://travis-ci.org/snowplow/snowplow.png?branch=master
[travis]: http://travis-ci.org/snowplow/snowplow

[release-image]: https://img.shields.io/badge/release-0.1.0-orange.svg?style=flat
[releases]: https://travis-ci.com/dilyand/toffee-box
