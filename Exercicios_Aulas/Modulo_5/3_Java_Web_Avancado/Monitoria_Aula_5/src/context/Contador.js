import { useState } from "react";
import { createContext } from "react";

export const ContadorContext = createContext()

export default function ContadorProvider(props){

    const [count, setCount] = useState(0);

    return(
        <ContadorContext.Provider value={{count, setCount}}>
            {props.children}
        </ContadorContext.Provider>
    )
}