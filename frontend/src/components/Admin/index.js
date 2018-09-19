import React from "react";
import "./Admin.css";
import RichTextEditor from "react-rte";
import axios from "axios";
import {connect} from 'react-redux';
let _valueHtml;
const apiPostsRoute = window.location.protocol + "//" + window.location.hostname + "/news/";

class Admin extends React.Component {
    state = {
        value: RichTextEditor.createEmptyValue()
    };

    onChange = (value) => {
        this.setState({value});
        _valueHtml = value.toString('html');
        if (this.props.onChange) {
            // Send the changes up to the parent component as an HTML string.
            // This is here to demonstrate using `.toString()` but in a real app it
            // would be better to avoid generating a string on each change.
            this.props.onChange(
                _valueHtml
            );
        }
    };

    onSbmButtClick = (e) => {
        let title = document.getElementById('titleInp').value;
        let data = {
            "body": _valueHtml,
            "title": title
        };
        console.log(data);
        this.props.onAddPost(data);

        axios.post(apiPostsRoute,data)
            .then(res=>{
                console.log(res);
            })
    };

    render() {
        return (
            <div>
                <RichTextEditor
                    id="rte"
                    value={this.state.value}
                    onChange={this.onChange}
                />
                <br/>
                <label>Title: </label><input id="titleInp" placeholder="Title"/>
                <br/>
                <br/>
                <button id="submitNews" onClick={this.onSbmButtClick.bind(this)}>send news</button>
            </div>
        );
    }
}
export default connect(
    //map state to props
    state => ({
        testStore: state
    }),
    dispatch => ({
        onAddPost: (postData) => {
            dispatch({type: 'ADD_POST', 'payload': postData})
        }
    })
)(Admin);