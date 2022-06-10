import React from 'react';


export class TodoList extends React.Component {
    render() {
      return (
        <ul>
          {this.props.items.map(item => (
            <li key={item.key}>{item.text}</li>
          ))}
        </ul>
      );
    }
}
