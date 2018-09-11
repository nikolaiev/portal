import React from 'react';
import Post from '../Post'

class PostList extends React.Component {
    constructor() {
        super();
        this.state = {
            posts: []
        }
    }

    render(){
        let posts = this.props.posts.map( (post) => {
            return <Post post={post}/>
        });
        return (
            <ul className="list-group">
                {posts}
            </ul>
        )
    }
}

export default PostList