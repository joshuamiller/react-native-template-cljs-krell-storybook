import React from "react";
import Component from "../../../js/Component";

export default {
  title: "Component/Default",
  component: Component
};

const Template = args => <Component {...args}/>;
export const Default = Template.bind({});
