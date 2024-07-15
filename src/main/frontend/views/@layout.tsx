import { NavLink, Outlet } from "react-router-dom";
import React from "react";

export default function Layout() {
    return (
        <div className="p-m">
            <nav>
                <NavLink className="btn btn-outline-info m-1" to="/">Home</NavLink>
                <NavLink className="btn btn-outline-info m-1" to="/chat">Chat</NavLink>
                <NavLink className="btn btn-outline-info m-1" to="/person">Person</NavLink>
            </nav>
            <main>
                <Outlet></Outlet>
            </main>
        </div>
    );
}
