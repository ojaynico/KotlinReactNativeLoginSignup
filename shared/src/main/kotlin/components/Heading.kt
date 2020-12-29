package components

import ojaynico.kotlin.react.text
import headingStyles
import react.*

interface HeadingProps : RProps {
    var title: String
    var style: dynamic
}

val Heading = functionalComponent<HeadingProps> { props ->
    text(props.title) {
        style = arrayOf(headingStyles.text, props.style)
    }
}
