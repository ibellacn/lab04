import styled from "styled-components";

export const Flexbox = styled.div`
  width: auto;
  max-width: 310px;
`;

export const Label = styled.label`
  font-family: "Trebuchet MS";
  font-size: 14px;
  line-height: 21px;
  color: #333333;
  margin-bottom: 4px;
  user-select: none;
`;

export const Select = styled.select`
  height: 40px;
  box-sizing: border-box;
  border: 1px solid;
  border-color: #cccccc;
  border-radius: 2px;
  padding: 0 8px;
  background-color: #ffffff;
  font-family: "Trebuchet MS";
  color: #333333;
  font-size: 16px;
  line-height: 24px;
`;

export const Option = styled.option``;

export const Error = styled.span`
  font-size: 12px;
  color: red;
  align-self: flex-end;
  margin-top: 10px;
  margin-bottom: 10px;
`;
