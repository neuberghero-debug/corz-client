package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.class_1646;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3850;
import net.minecraft.class_3852;
import net.minecraft.class_6880;

public final class lilIiIiliilIiIil {
   public long IIliillIil;
   public long liIiillIil;
   private static final long IlIiillIil = -4611686018427387904L;
   public class_243 IlilillIil = class_243.field_1353;
   public long ilIiillIil;
   public long llIiillIil;
   public boolean IIIiillIil;
   public int iIilillIil;
   public long IiIiillIil;
   public long iiIiillIil;
   public final UUID lIilillIil;
   public class_2338 llilillIil = class_2338.field_10980;
   public int liilillIil;
   public String IiilillIil = IIlllIlliIll<"IIlllIlliIll","maFRUI+Zk+jpiRRCmCESw5yBN1rjQeVoCkQ2caVFa48=">();
   public List<lIllIilliIllIill> lIIiillIil;
   public class_6880<class_3852> ililillIil;
   public int iiilillIil;
   public int lIliillIil;
   private String iIIiillIil;

   public void liiiIIllIl(int newLevel) {
      if (this.liilillIil > 0 && newLevel != this.liilillIil) {
         this.lIIiillIil = new ArrayList<>();
         this.iIIiillIil = "";
         this.liIiillIil = -4611686018427387904L;
      }

      this.liilillIil = newLevel;
   }

   public void lIiiIiIlilli(boolean hinted, boolean stillDrained) {
      if (!stillDrained) {
         this.lIliillIil = 0;
      } else if (hinted) {
         this.lIliillIil = Math.min(this.lIliillIil + 1, 4);
      }
   }

   public boolean IilliliilIIi(List<lIllIilliIllIill> parsed) {
      long var5 = -1789097101990116682L;
      StringBuilder var2 = new StringBuilder();

      for (lIllIilliIllIill var4 : parsed) {
         var2.append(var4.lIiiIiIlilli()).append('|');
      }

      String var7 = var2.toString();
      var5 ^= ((long)(!var7.equals(this.iIIiillIil) ? 1 : 0) << 32 ^ var5) & -1L << 32;
      this.lIIiillIil = new ArrayList<>(parsed);
      this.iIIiillIil = var7;
      return (boolean)((int)(var5 >>> 32));
   }

   public boolean iIlIlllllill(IiIlIIiliIlIIi t) {
      long var3 = -4144249891799216581L;
      var3 ^= ((long)(t == null ? 0 : t.IlIlllIlilIl()) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) > 0 && this.liilillIil > 0 && this.liilillIil < (int)(var3 >>> 32);
   }

   public lilIiIiliilIiIil(UUID uuid) {
      this.IIIiillIil = true;
      this.lIIiillIil = new ArrayList<>();
      this.iIIiillIil = "";
      this.ilIiillIil = -4611686018427387904L;
      this.IiIiillIil = -4611686018427387904L;
      this.liIiillIil = -4611686018427387904L;
      this.iiIiillIil = -4611686018427387904L;
      this.IIliillIil = -4611686018427387904L;
      this.lIilillIil = uuid;
   }

   public boolean IlIlllIlilIl(IiIlIIiliIlIIi t) {
      return this.IIIllIIliIIl(t) != iIIIlIllIlIIlIll.IIiiIlllll;
   }

   public lIllIilliIllIill IiIlliIliiIl(IiIlIIiliIlIIi t) {
      if (t != null && t.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl && t.IlliiIilillliiIili > 0) {
         for (lIllIilliIllIill var3 : this.lIIiillIil) {
            if (var3.iIlIlllllill() && IIilIlIllIilIlIl.liiiIIllIl(t, var3, true) && !IIilIlIllIilIlIl.iIlIlllllill(t, var3)) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean iliIiiliiiii(long tick) {
      return tick < this.iiIiillIil;
   }

   public void IliIlllilIi(class_1646 villager, long tick) {
      this.iIilillIil = villager.method_5628();
      this.IlilillIil = villager.method_73189();
      this.llilillIil = villager.method_24515();
      class_3850 var4 = villager.method_7231();
      this.ililillIil = var4.comp_3521();
      this.IiilillIil = lIIllilliIIllill.lIiiIiIlilli(this.ililillIil);
      this.liiiIIllIl(var4.comp_3522());
      this.iiilillIil = villager.method_19269();
      this.IIIiillIil = !villager.method_6109()
         && this.ililillIil != null
         && !this.ililillIil.method_40225(class_3852.field_17051)
         && !this.ililillIil.method_40225(class_3852.field_17062);
      this.llIiillIil = tick;
   }

   public iIIIlIllIlIIlIll IIIllIIliIIl(IiIlIIiliIlIIi t) {
      long var6 = -7456834620572762175L;
      if (t != null && IIilIlIllIilIlIl.IilliliilIIi(this, t)) {
         iIIIlIllIlIIlIll var2 = iIIIlIllIlIIlIll.IIiiIlllll;

         for (lIllIilliIllIill var4 : this.lIIiillIil) {
            if (IIilIlIllIilIlIl.liiiIIllIl(t, var4, true)) {
               var6 ^= ((long)IIilIlIllIilIlIl.iIlIlllllill(t, var4) << 32 ^ var6) & -1L << 32;
               if (var4.iIlIlllllill() && (int)(var6 >>> 32) != 0) {
                  return iIIIlIllIlIIlIll.IIiiIlllll;
               }

               if (!var4.iIlIlllllill()) {
                  var2 = iIIIlIllIlIIlIll.lIiiIlllll;
               } else if (var2 == iIIIlIllIlIIlIll.IIiiIlllll) {
                  var2 = iIIIlIllIlIIlIll.iIiiIlllll;
               }
            }
         }

         return var2;
      } else {
         return iIIIlIllIlIIlIll.IIiiIlllll;
      }
   }
}
