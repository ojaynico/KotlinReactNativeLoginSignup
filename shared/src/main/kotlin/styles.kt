import ojaynico.kotlin.react.native.StyleSheet

val sharedStyles = StyleSheet.create(object {
    val container = object {
        val flex = 1
        val padding = 16
        val paddingTop = 120
        val alignItems = "center"
    }
})

val headingStyles = StyleSheet.create(object {
    val text = object {
        val color = "black"
        val fontSize = 32
    }
})

val inputStyles = StyleSheet.create(object {
    val input = object {
        val backgroundColor = "#e8e8e8"
        val width = "100%"
        val padding = 20
        val borderRadius = 8
    }
})

val loginStyles  = StyleSheet.create(object {
    val title = object {
        val marginVertical = 48
    }
    val input = object {
        val marginVertical = 8
    }
    val loginButton = object {
        val marginVertical = 20
    }
})

val buttonStyles = StyleSheet.create(object {
    val container = object {
        val backgroundColor = "purple"
        val width = "100%"
        val alignItems = "center"
        val justifyContent = "center"
        val padding = 20
        val borderRadius = 8
    }
    val text = object {
        val color = "white"
        val fontWeight = "500"
        val fontSize = 16
    }
})

val textButtonStyles = StyleSheet.create(object {
    val container = object {
        val width = "100%"
        val alignItems = "center"
        val justifyContent = "center"
        val padding = 20
        val borderRadius = 8
    }
    val text = object {
        val color = "purple"
        val fontWeight = "500"
        val fontSize = 14
    }
})

val errorStyles = StyleSheet.create(object {
    val container = object {
        val paddingVertical = 8
    }
    val text = object {
        val color = "red"
        val fontWeight = "bold"
    }
})

val iconStyles = StyleSheet.create(object {
    val closeIcon = object {
        val position = "absolute"
        val top = 60
        val right = 16
    }
    val iconSize = object {
        val width = 25
        val height = 25
    }
})
