import React, { useRef, useState } from 'react';

const inputstyle = {width:"3rem",margin:".5rem",height:"1.2rem"}

const Sum = () => {
    const [addValue,setAddValue] = useState()
    const inputFEL = useRef(null)
    const inputSEL = useRef(null)

    const add = () => {
        setAddValue(inputFEL.current.value+inputSEL.current.value)
    }
    return ( <div>
        <h1>Sum</h1>
        <p>더하기</p>
        <input ref={inputFEL} type="text" style={inputstyle}></input>
        <input ref={inputSEL} type="text" style={inputstyle}></input>
        <button onClick={add}>더하기</button>
        <h2>{addValue}</h2>
    </div> );
}
 
export default Sum;