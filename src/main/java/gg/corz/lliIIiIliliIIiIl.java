package gg.corz;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import net.minecraft.class_1011;
import net.minecraft.class_1044;

final class lliIIiIliliIIiIl extends class_1044 {
   lliIIiIliliIIiIl(String levels, class_1011[] label) {
      GpuDevice var3 = RenderSystem.getDevice();
      int var4 = label[0].method_4307();
      int var5 = label[0].method_4323();
      this.field_56974 = var3.createTexture(levels, 5, TextureFormat.RGBA8, var4, var5, 1, label.length);

      try {
         this.field_60597 = var3.createTextureView(this.field_56974);
         this.field_63613 = iiiIIlllIIIlIlll.IIillIiliIil(var3, label.length > 1);
         CommandEncoder var6 = var3.createCommandEncoder();

         for (int var7 = 0; var7 < label.length; var7++) {
            var6.writeToTexture(this.field_56974, label[var7], var7, 0, 0, 0, var4 >> var7, var5 >> var7, 0, 0);
         }
      } catch (RuntimeException var8) {
         this.close();
         throw var8;
      }
   }
}
