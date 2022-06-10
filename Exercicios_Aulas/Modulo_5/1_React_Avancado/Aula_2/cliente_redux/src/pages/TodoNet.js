import {useEffect, useState} from 'react'
import {TodoList} from "./TodoList"
import {adicionarTodo,obterTodos} from "../net/service"

function TodoNet () {
   
    const [items, setItems] = useState([]);
    const [text, setText] = useState('');
    const [conectado, setConectado] = useState(false);

    useEffect(()=>{
      if(!conectado){
        setConectado(true);
        obterTodos().then((retorno)=>setItems(retorno.todos));
      }
    });
    
    function handleChange(e) {
        setText(e.target.value);
    }

    function handleSubmit(e) {
        e.preventDefault();
        if (text.length === 0) {
          return;
        }
        var chave=items.length+1;
        adicionarTodo(chave,text).then(
                 (retorno)=>setItems(retorno.todos));
        setText('');
    }
    
    return (
      <div>
        <h3>Tarefas Net</h3>
        <TodoList items={items} />
        <form onSubmit={handleSubmit}>
          <label htmlFor="new-todo">
            O que precisa ser feito?
          </label>
          <input
            id="new-todo"
            onChange={handleChange}
            value={text}
          />
          <button>
            Adicionar #{items.length + 1}
          </button>
        </form>
      </div>
    );
}

export default TodoNet;
