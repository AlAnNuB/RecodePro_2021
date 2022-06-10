function Rodape(){
    var valores = [];
    for(var i = 1; i < 100000; i++)
       valores.push({key: i, text: "valor "+i});
    return(
        <div>
      <a
        className="App-link"
        href="https://reactjs.org"
        target="_blank"
        rel="noopener noreferrer"
      >
        &copy;Recode 2021
      </a>
      <hr/>
      <ul>
      {valores.map((item)=>{
         return <li key={item.key}>{item.text}</li>
     })}
     </ul>
      </div>
    );
}
export default Rodape;