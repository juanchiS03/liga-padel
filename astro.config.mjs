// @ts-check
import { defineConfig } from 'astro/config';

import tailwindcss from '@tailwindcss/vite';

// https://astro.build/config
export default defineConfig({
  srcDir: './frontend/src', 
  // Le decimos dónde están los archivos públicos (imágenes, etc.)
  publicDir: './frontend/public', 
  vite: {
    plugins: [tailwindcss()]
  }
});