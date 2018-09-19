import React, {Component} from "react";
import "./App.css";
import Admin from "./components/Admin";
import PostList from "./components/PostList";
import Menu from "./components/Menu";
import Login from "./components/Login"
import {HashRouter, Route} from "react-router-dom";
import {connect} from 'react-redux';


import axios from "axios";

function withProps(Component, props) {
    return function (matchProps) {
        return <Component {...props} {...matchProps} />
    }
}

// const apiPostsRoute = window.location.protocol+"//"+window.location.hostname+"/news/";
const apiPostsRoute = window.location.protocol + "//localhost:8088/news/";

class App extends Component {

    constructor() {
        super();
        this.getData();
    }

    //TODO update to set data to testStore
    getData() {
        axios.get(apiPostsRoute)
            .then(res => {
                //this.props.onLoadPost()
                    this.setState({posts: res.data.content});
                    console.log(res.data.content)
                }
            )
    }

    render() {
        console.log(this.props.testStore);
        return (
            <HashRouter>
                <div className="App-body">
                    <Menu/>
                    <div className="App-image">
                        <Route exact path='/' component={PostList}/>
                        <Route path='/admin' component={Admin}/>
                        <Route path='/login' component={Login}/>
                    </div>
                </div>
            </HashRouter>
        );
    }
}

export default connect(
    //map state to props
    state => ({
        testStore: state
    }),
    dispatch => ({
        onLoadPost: (postData) => {
            dispatch({type: 'ADD_POST', 'payload': postData})
        }
    })
)(App);
