# toffee-box

[![Build Status][travis-image]][travis]
[![Release][release-image]][releases]

Testing automated deployment with Travis.

- [x] Commits to any branch should trigger `sbt test`.
- [ ] Tagged commits should trigger `./deploy.sh` and upload the `jar` to S3.
