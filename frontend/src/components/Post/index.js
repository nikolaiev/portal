// src/components/Post/index.js
import React, { Component } from "react";
import "./Post.css";

class Post extends Component {
    constructor(){
        super()
    }
    render() {

        let post = this.props.post;
        const title = post.title;
        const body = post.body;

        return (<article className="Post" ref="Post">
            <header>
                <div className="Post-image">
                    <div> {title}</div>
                </div>
            </header>
            <div className="Post-body">
                <div className="Post-image-bg">
                    <div dangerouslySetInnerHTML={{__html : body}} />
                </div>
            </div>
        </article>);
    }
}
export default Post;