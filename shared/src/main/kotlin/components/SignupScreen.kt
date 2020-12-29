package components

import buttonStyles
import errorStyles
import iconStyles
import inputStyles
import loginStyles
import ojaynico.kotlin.react.*
import ojaynico.kotlin.react.native.StyleSheet
import ojaynico.kotlin.react.native.navigation.Navigation
import react.*
import sharedStyles

interface SignupProps : RProps {
    val componentId: String
}

class SignupScreen : RComponent<SignupProps, RState>() {
    override fun RBuilder.render() {
        view {
            attrs.style = sharedStyles.container
            child(Heading) {
                attrs.title = "REGISTRATION"
                attrs.style = loginStyles.title
            }

            touchableOpacity {
                this.attrs.style = iconStyles.closeIcon
                this.attrs.onPress = {
                    Navigation.pop(props.componentId)
                }
                image {
                    this.source = kotlinext.js.require("./resources/images/close.png")
                    this.style = iconStyles.iconSize
                }
            }

            textInput {
                style = StyleSheet.compose(inputStyles.input, loginStyles.input)
                placeholder = "Email"
                keyboardType = "email-address"
            }
            textInput {
                style = StyleSheet.compose(inputStyles.input, loginStyles.input)
                placeholder = "Password"
                secureTextEntry = true
            }
            touchableOpacity {
                attrs.style = arrayOf(buttonStyles.container, loginStyles.loginButton)
                attrs.onPress = {

                }
                text("Register".toUpperCase()) {
                    style = buttonStyles.text
                }
            }

        }
    }
}
