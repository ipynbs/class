import React, { useState } from 'react';

const mybtn = {color:"#333",fontSize:'1.5rem',padding:"0 .5rem"}

// sfc
const Counter = () => {
    const [number,setNumber] = useState(0)

    const addbtn = () => {
        setNumber(number+1)
    }
    
    const subbtn = () => {
        setNumber(number-1)
    }

    return ( <div>
        <h1>Counter</h1>
        <p>Counter 입니다</p>
        <button style={mybtn} onClick={addbtn}>+</button>
        <span style={{margin:"0 .5rem"}}>{number}</span>
        <button style={mybtn} onClick={subbtn}>-</button>
    </div> );
}
 
export default Counter;