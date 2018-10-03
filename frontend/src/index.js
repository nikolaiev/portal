import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import {Provider} from 'react-redux';
import {createStore} from 'redux';

function reducer(state = [], action) {
    console.log("reducer called");

    if (action.type === 'ADD_POST') {
        return [
            ...state,
            action.payload
        ];
    }

    if (action.type === 'CLEAN_UP') {
        return [];
    }

    return state;
}

const store = createStore(reducer);

ReactDOM.render(
    <Provider store={store}>
        <App />
    </Provider>, document.getElementById('root')
);
registerServiceWorker();
