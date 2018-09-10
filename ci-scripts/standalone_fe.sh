#!/usr/bin/env bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
#BACKEND_DIR=$(cd ${DIR} && cd ../backend && pwd)
FRONTEND_DIR=$(cd ${DIR} && cd ../frontend && pwd)

#check if PORT parameter was passed
#mock_server_run.sh 3031
if [ -z $1 ]
then
    (cd ${FRONTEND_DIR} && npm start)
#mock_server_run.sh
else
    (cd ${FRONTEND_DIR} && npm start $1)
fi