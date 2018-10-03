import React from "react";
import Post from "../Post";
import "./PostList.css";
import { connect } from 'react-redux';


class PostList extends React.Component {
    // constructor() {
    //     super();
    //     this.state = {
    //         posts: []
    //     }
    // }

    render(){
        console.log("Post List ")
        console.log(this.props.testStore);

        let posts = this.props.testStore.map( (post, index) => {
            return <Post key={index} post={post}/>
        });
        return (
            <ul className="list-group">
                {posts}
            </ul>
        )
    }
}

export default connect(
    //map state to props
    state => ({
        testStore : state
    }),
    dispatch => ({})
)(PostList);