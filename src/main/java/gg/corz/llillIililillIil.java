package gg.corz;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import net.minecraft.class_1661;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;

public final class llillIililillIil implements ilIliiIlIiIliiIl {
   private final IiIIiIIlliIIiIIl IllliIlIil;
   private final LongOpenHashSet lllliIlIil = new LongOpenHashSet();
   public static final float iIlliIlIil = 30.0F;
   private final class_2339 illliIlIil = new class_2339();
   private long IilliIlIil = 3129683211590213489L ^ -6093688825264562319L;

   public void IlIlllIlilIl(class_2338 pos) {
      this.IilliIlIil = pos == null ? -7498193716969564236L ^ 1725178319885211572L : pos.method_10063();
   }

   @Override
   public float iIlIlllllill(int z, int x, int y) {
      class_1937 var4 = this.IllliIlIil.IIlllIlliIll();
      class_746 var5 = class_310.method_1551().field_1724;
      if (var4 != null && var5 != null) {
         this.illliIlIil.method_10103(z, x, y);
         class_2680 var6 = var4.method_8320(this.illliIlIil);
         float var7 = Math.max(0.0F, var6.method_26214(var4, this.illliIlIil));
         float var8 = 1.0F;
         class_1661 var9 = var5.method_31548();

         for (int var10 = 0; var10 < 9; var10++) {
            var8 = Math.max(var8, var9.method_5438(var10).method_7924(var6));
         }

         return 1.0F + var7 * 30.0F / var8 / 5.0F;
      } else {
         return 1.0F;
      }
   }

   @Override
   public float lIiiIiIlilli(int y, int z, int x) {
      return lIilIiliIilIil.IIIllIIliIIl(this.IllliIlIil, y, z, x) ? 30.0F : 0.0F;
   }

   public llillIililillIil(IiIIiIIlliIIiIIl cells) {
      this.IllliIlIil = cells;
   }

   @Override
   public boolean iliIiiliiiii(int z, int x, int y) {
      return lIilIiliIilIil.IIIllIIliIIl(this.IllliIlIil, z, x, y);
   }

   public void IiIlliIliiIl(class_2338 pos) {
      if (pos != null) {
         this.lllliIlIil.add(pos.method_10063());
      }
   }

   @Override
   public boolean IilliliilIIi(int z, int x, int y) {
      return this.lllliIlIil.contains(class_2338.method_10064(z, x, y))
         || lIilIiliIilIil.liiiIIllIl(this.IllliIlIil.IliIlllilIi(z, x, y), (673240448 - -55) * -724452315 ^ -266844311);
   }

   public void IIlllIlliIll() {
      this.lllliIlIil.clear();
   }

   @Override
   public boolean IIIllIIliIIl(int y, int z, int x) {
      return lIilIiliIilIil.liiiIIllIl(this.IllliIlIil.IliIlllilIi(y, z, x), 4);
   }

   @Override
   public boolean liiiIIllIl(int z, int y, int x) {
      long var4 = class_2338.method_10064(z, y, x);
      return var4 != this.IilliIlIil && !this.lllliIlIil.contains(var4) ? lIilIiliIilIil.iliIiiliiiii(this.IllliIlIil, z, y, x) : false;
   }

   public boolean Illlllllilll(class_2338 pos) {
      return pos != null && this.lllliIlIil.contains(pos.method_10063());
   }

   @Override
   public boolean IliIlllilIi(int z, int x, int y) {
      return lIilIiliIilIil.liiiIIllIl(this.IllliIlIil.IliIlllilIi(z, x, y), 1);
   }
}
