#!/usr/bin/env bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
BACKEND_DIR=$(cd ${DIR} && cd ../backend && pwd)

(cd ${BACKEND_DIR} && mvn spring-boot:run)