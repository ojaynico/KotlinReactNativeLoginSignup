package components

import buttonStyles
import errorStyles
import inputStyles
import loginStyles
import ojaynico.kotlin.react.*
import ojaynico.kotlin.react.native.StyleSheet
import ojaynico.kotlin.react.native.navigation.Navigation
import ojaynico.kotlin.react.text
import react.*
import sharedStyles
import textButtonStyles

interface LoginProps : RProps {
    val componentId: String
}

class LoginScreen : RComponent<LoginProps, RState>() {
    override fun RBuilder.render() {
            view {
                attrs.style = sharedStyles.container
                child(Heading) {
                    attrs.title = "LOGIN"
                    attrs.style = loginStyles.title
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
                        Navigation.push(props.componentId, json {
                            this.component = json {
                                this.name = "SignupScreen"
                                this.options = json {
                                    this.topBar = json {
                                        this.visible = false
                                        this.drawBehind = true
                                        this.animate = false
                                    }
                                }
                            }
                        })
                    }
                    text("Login".toUpperCase()) {
                        style = buttonStyles.text
                    }
                }
                touchableOpacity {
                    attrs.style = arrayOf(textButtonStyles.container, loginStyles.loginButton)
                    attrs.onPress = {

                    }
                    text("Have no account? Create One".toUpperCase()) {
                        style = textButtonStyles.text
                    }
                }
            }
    }
}
