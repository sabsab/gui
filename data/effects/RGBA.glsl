uniform sampler2D inputSampler;
uniform int ChannelR;
uniform int ChannelG;
uniform int ChannelB;
//uniform int ChannelA;

void main(void)
{
    vec4 inputColor = texture2D(inputSampler,gl_TexCoord[0].st);

    vec4 outputColor = inputColor;
    if(ChannelR == 0)
    {
        outputColor.r = 0.0;
    }

    if(ChannelG == 0)
    {
        outputColor.g = 0.0;
    }

    if(ChannelB == 0)
    {
        outputColor.b = 0.0;
    }
/*
    if(ChannelA == 0)
    {
        outputColor.a = 1.0;
    }
*/
    gl_FragColor = outputColor;
}
