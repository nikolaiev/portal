#!/usr/bin/env bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
BACKEND_DIR=$(cd ${DIR} && cd ../backend && pwd)
FRONTEND_DIR=$(cd ${DIR} && cd ../frontend && pwd)

(cd ${FRONTEND_DIR} && npm run build)
(cd ${BACKEND_DIR} && mvn clean install)