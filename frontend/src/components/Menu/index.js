import React, {Component} from "react";
import {Nav, NavItem, MenuItem, NavDropdown, Navbar} from 'react-bootstrap'
import "./Menu.css";


class MyMenu extends Component {

    render() {
        return (
            <div className="app-menu">
                <Navbar>
                    <Navbar.Header>
                        <Navbar.Brand>
                            <a href="#">React-Bootstrap</a>
                        </Navbar.Brand>
                    </Navbar.Header>
                    <Nav>
                        <NavItem eventKey={1} href="#menu_1">
                            Menu 1
                        </NavItem>
                        <NavItem eventKey={2} href="#menu_2">
                            Menu 2
                        </NavItem>
                        <NavDropdown eventKey={3} title="Dropdown" id="basic-nav-dropdown">
                            <MenuItem eventKey={3.1}>Action</MenuItem>
                            <MenuItem eventKey={3.2}>Another action</MenuItem>
                            <MenuItem eventKey={3.3}>Something else here</MenuItem>
                            <MenuItem divider/>
                            <MenuItem eventKey={3.4}>Separated link</MenuItem>
                        </NavDropdown>
                    </Nav>
                    <Nav pullRight>
                        {/*TODO sould be restricted for not admin. Allow only after login success*/}
                        <NavItem eventKey={4} href="#admin">
                            Admin
                        </NavItem>

                        <NavItem eventKey={5} href="#login">
                            Login
                        </NavItem>
                    </Nav>
                </Navbar>
            </div>
        )
    }
}

export default MyMenu
