uniform sampler2D bottomSampler;
uniform sampler2D topSampler;
uniform sampler2D maskSampler;

void main(void)
{
    vec4 botColor = texture2D(bottomSampler, gl_TexCoord[0].st);
    vec4 topColor = texture2D(topSampler, gl_TexCoord[0].st);
    vec4 maskColor = texture2D(maskSampler, gl_TexCoord[0].st);

    vec4 comp;

    comp.rgb = botColor.rgb;
    comp.a = botColor.a * maskColor.a;

    gl_FragColor = comp;
}
