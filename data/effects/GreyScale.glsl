uniform sampler2D inputSampler;
uniform float scale;

void main(void)
{
    vec4 inputColor = texture2D(inputSampler,gl_TexCoord[0].st);

    vec4 p = inputColor;

    float luma = 0.3 * p.r + 0.59 * p.g + 0.11 * p.b;
    p.r = luma + (p.r-luma) * (1.0-scale);
    p.g = luma + (p.g-luma) * (1.0-scale);
    p.b = luma + (p.b-luma) * (1.0-scale);

    gl_FragColor = p;
}
