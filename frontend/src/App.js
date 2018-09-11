import React, {Component} from 'react';
import './App.css';
import Header from './components/Header';
import Admin from './components/Admin';
import PostList from './components/PostList';
import {HashRouter, Switch, Route} from 'react-router-dom'

import axios from 'axios'

function withProps(Component, props) {
    return function (matchProps) {
        return <Component {...props} {...matchProps} />
    }
}

class App extends Component {

    constructor() {
        super();
        this.state = {
            posts: []
        };
        this.getData();
    }

    getData() {
        axios.get("http://localhost:8088/news/")
            .then(res => {
                    this.setState({posts: res.data.content});
                    console.log(res.data.content)
                }
            )
    }

    render() {
        return (
            <HashRouter>
                <div>
                    <Route exact path='/' component={withProps(PostList, {posts: this.state.posts})}/>
                    <Route path='/admin' component={Admin}/>
                </div>
            </HashRouter>
        );
    }
}

export default App;
