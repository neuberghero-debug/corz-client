package gg.corz;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import net.minecraft.class_276;
import net.minecraft.class_310;

public final class lllIlilillIlil {
   private GpuTexture ilIlliiIiIiIlliiIi;
   private int IlilliiIillilliiIi;
   private GpuTexture IlIlliiIillIlliiIi;
   private GpuTextureView iiiIliiIiIIIlliiIi;
   private GpuTexture IiiIliiIiliiIliiIi;
   private GpuTextureView liIlliiIiiiIlliiIi;
   private final GpuTextureView[] iillliiIiIIilliiIi;
   private boolean ililliiIiIiilliiIi;
   private GpuTexture iIllliiIiIlllliiIi;
   private boolean liilliiIiiiilliiIi;
   private final GpuTexture[] IillliiIilillliiIi;
   public static final int IIiIliiIilIiIliiIi = 4;
   private final class_310 iIiIliiIiIliIliiIi = class_310.method_1551();
   private GpuTextureView IIllliiIilIllliiIi;
   private int lIilliiIiiIilliiIi;
   private GpuTextureView llllliiIiilllliiIi;
   private GpuTexture lliIliiIiiliIliiIi;
   private GpuTextureView lIIlliiIiiIIlliiIi;

   private static GpuTexture IIIilIIiiIIi(String label, int w, int h) {
      return RenderSystem.getDevice().createTexture(() -> label, 13, TextureFormat.DEPTH32, w, h, 1, 1);
   }

   private void Ililllililil(int h, int w) {
      long var4 = 3185742027770283873L;
      if (h != this.lIilliiIiiIilliiIi || w != this.IlilliiIillilliiIi || this.lliIliiIiiliIliiIi == null) {
         this.IlIillIiilIi();
         this.lliIliiIiiliIliiIi = Iiilliiliiil(
            IIiilIiiiIii<"IIiilIiiiIii","x3I7G1BFIRuzQYAtu7J1tVk+mNpMbUNp8UqNUxZlG72n5qWuR8q0YlAY00Z2BFhqa9U1vrwR2Uw=">(), h, w
         );
         this.iiiIliiIiIIIlliiIi = RenderSystem.getDevice().createTextureView(this.lliIliiIiiliIliiIi);
         this.IiiIliiIiliiIliiIi = Iiilliiliiil(
            IIiilIiiiIii<"IIiilIiiiIii","bjAlVPRn+k5BV7BkLLdUDP4rxYXiqfeIjxQIp0uW5Fcw71a4SRMtQu8YzIqseucyv1YDt6Tjaw==">(), h, w
         );
         this.lIIlliiIiiIIlliiIi = RenderSystem.getDevice().createTextureView(this.IiiIliiIiliiIliiIi);
         this.IlIlliiIillIlliiIi = IIIilIIiiIIi(
            IIiilIiiiIii<"IIiilIiiiIii","Am2LwHliIObFJHcz9XzQSpO5t+HI17Qh96eqSPauiV527koAF+Z0j/3QOsK28PWGlwesm8yoqc0=">(), h, w
         );
         this.liIlliiIiiiIlliiIi = RenderSystem.getDevice().createTextureView(this.IlIlliiIillIlliiIi);
         this.ilIlliiIiIiIlliiIi = IIIilIIiiIIi(
            IIiilIiiiIii<"IIiilIiiiIii","1kfq7+yUPOePQ74OiTHztTjm7xNj4hVoHKe5EVcvpHdZtQhZmvWCvRJwl2sSWZVjjEIsb0eSTw==">(), h, w
         );
         this.IIllliiIilIllliiIi = RenderSystem.getDevice().createTextureView(this.ilIlliiIiIiIlliiIi);
         this.iIllliiIiIlllliiIi = Iiilliiliiil(IIiilIiiiIii<"IIiilIiiiIii","pll1vCZ3TlvFMqeIQI82E7FioyqXd4wGVkOiUxl254QNk6nn/6yWaUFQMaNXmUqQ">(), h, w);
         this.llllliiIiilllliiIi = RenderSystem.getDevice().createTextureView(this.iIllliiIiIlllliiIi);

         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 4; var6 += 4294967296L) {
            this.IillliiIilillliiIi[(int)(var6 >>> 32)] = Iiilliiliiil(
               IIiilIiiiIii<"IIiilIiiiIii","e5WeyZpLnsasUR/MsYXjxhHeXXIJjthTVld9F61oxWLv54iKVyZzqw113wSxHp5pyz5WW+c=">() + (int)(var6 >>> 32), h, w
            );
            this.iillliiIiIIilliiIi[(int)(var6 >>> 32)] = RenderSystem.getDevice().createTextureView(this.IillliiIilillliiIi[(int)(var6 >>> 32)]);
         }

         this.lIilliiIiiIilliiIi = h;
         this.IlilliiIillilliiIi = w;
      }
   }

   public GpuTextureView iIlIlllllill() {
      return this.iiiIliiIiIIIlliiIi;
   }

   private void IlIillIiilIi() {
      long var2 = 7220774222504938374L;
      this.iiiIliiIiIIIlliiIi = IIlilIliiIli(this.iiiIliiIiIIIlliiIi);
      this.lliIliiIiiliIliiIi = IiIiliIiiiIi(this.lliIliiIiiliIliiIi);
      this.lIIlliiIiiIIlliiIi = IIlilIliiIli(this.lIIlliiIiiIIlliiIi);
      this.IiiIliiIiliiIliiIi = IiIiliIiiiIi(this.IiiIliiIiliiIliiIi);
      this.liIlliiIiiiIlliiIi = IIlilIliiIli(this.liIlliiIiiiIlliiIi);
      this.IlIlliiIillIlliiIi = IiIiliIiiiIi(this.IlIlliiIillIlliiIi);
      this.IIllliiIilIllliiIi = IIlilIliiIli(this.IIllliiIilIllliiIi);
      this.ilIlliiIiIiIlliiIi = IiIiliIiiiIi(this.ilIlliiIiIiIlliiIi);
      this.llllliiIiilllliiIi = IIlilIliiIli(this.llllliiIiilllliiIi);
      this.iIllliiIiIlllliiIi = IiIiliIiiiIi(this.iIllliiIiIlllliiIi);

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 4; var4 += 4294967296L) {
         this.iillliiIiIIilliiIi[(int)(var4 >>> 32)] = IIlilIliiIli(this.iillliiIiIIilliiIi[(int)(var4 >>> 32)]);
         this.IillliiIilillliiIi[(int)(var4 >>> 32)] = IiIiliIiiiIi(this.IillliiIilillliiIi[(int)(var4 >>> 32)]);
      }
   }

   public boolean IiIlliIliiIl() {
      return this.liilliiIiiiilliiIi;
   }

   public GpuTextureView IIIllIIliIIl() {
      return this.llllliiIiilllliiIi;
   }

   public void Iilllilliill() {
      this.ililliiIiIiilliiIi = false;
      this.liilliiIiiiilliiIi = false;
   }

   public GpuTextureView IilliliilIIi() {
      return this.lIIlliiIiiIIlliiIi;
   }

   public boolean IIlllIlliIll() {
      if (this.ililliiIiIiilliiIi) {
         return true;
      } else {
         class_276 var1 = this.iIiIliiIiIliIliiIi.method_1522();
         if (var1 != null && var1.method_30277() != null) {
            this.Ililllililil(var1.field_1482, var1.field_1481);
            CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
            var2.copyTextureToTexture(var1.method_30277(), this.lliIliiIiiliIliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            if (var1.method_30278() != null) {
               var2.copyTextureToTexture(var1.method_30278(), this.IlIlliiIillIlliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            }

            this.ililliiIiIiilliiIi = true;
            this.liilliiIiiiilliiIi = false;
            return true;
         } else {
            return false;
         }
      }
   }

   public lllIlilillIlil() {
      this.IillliiIilillliiIi = new GpuTexture[4];
      this.iillliiIiIIilliiIi = new GpuTextureView[4];
      this.lIilliiIiiIilliiIi = 0;
      this.IlilliiIillilliiIi = 0;
      this.ililliiIiIiilliiIi = false;
      this.liilliiIiiiilliiIi = false;
   }

   private static GpuTexture Iiilliiliiil(String label, int w, int h) {
      return RenderSystem.getDevice().createTexture(() -> label, 13, TextureFormat.RGBA8, w, h, 1, 1);
   }

   private static GpuTexture IiIiliIiiiIi(GpuTexture t) {
      if (t != null) {
         t.close();
      }

      return null;
   }

   public void IIillIiliIil() {
      this.IlIillIiilIi();
      this.lIilliiIiiIilliiIi = 0;
      this.IlilliiIillilliiIi = 0;
   }

   public int IliIlllilIi() {
      return this.lIilliiIiiIilliiIi;
   }

   public int liiiIIllIl() {
      return this.IlilliiIillilliiIi;
   }

   private static GpuTextureView IIlilIliiIli(GpuTextureView v) {
      if (v != null) {
         v.close();
      }

      return null;
   }

   public GpuTextureView iliIiiliiiii() {
      return this.IIllliiIilIllliiIi;
   }

   public GpuTextureView IlIlllIlilIl(int slot) {
      return this.iillliiIiIIilliiIi[slot];
   }

   public boolean Illlllllilll() {
      if (!this.ililliiIiIiilliiIi) {
         return false;
      } else if (this.liilliiIiiiilliiIi) {
         return true;
      } else {
         class_276 var1 = this.iIiIliiIiIliIliiIi.method_1522();
         if (var1 != null && var1.method_30277() != null) {
            this.Ililllililil(var1.field_1482, var1.field_1481);
            CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
            var2.copyTextureToTexture(var1.method_30277(), this.IiiIliiIiliiIliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            if (var1.method_30278() != null) {
               var2.copyTextureToTexture(var1.method_30278(), this.ilIlliiIiIiIlliiIi, 0, 0, 0, 0, 0, this.lIilliiIiiIilliiIi, this.IlilliiIillilliiIi);
            }

            this.liilliiIiiiilliiIi = true;
            return true;
         } else {
            return false;
         }
      }
   }

   public GpuTextureView lIiiIiIlilli() {
      return this.liIlliiIiiiIlliiIi;
   }
}
