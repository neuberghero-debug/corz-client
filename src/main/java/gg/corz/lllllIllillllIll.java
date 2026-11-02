package gg.corz;

import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1113;
import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1540;
import net.minecraft.class_1541;
import net.minecraft.class_1542;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2312;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3419;

public class lllllIllillllIll extends ilIllIiIll {
   private static volatile int liliiillll = 0;
   private final iiIiiilIIliiil iiIiiillll;
   private final iiIiiilIIliiil illiiillll;
   private final iiIiiilIIliiil lIliiillll;
   private static final long ilIiiillll = 1000L;
   private final ConcurrentHashMap<class_2960, long[]> iiliiillll;
   private final iiIiiilIIliiil Illiiillll;
   private final iiIiiilIIliiil IiIiiillll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","Q7rxEFFbUCuRpSSuuhWcA14gaPrrKUT7hT37JAFxdvVJ">(),
      IliIlllilIi<"IliIlllilIi","og82etrTI+issrROIOSQdl6EueVsXrHVvwAgFYsppE4N0jYe2JjVh+3aT6Jt/WYVndqer6GUYQq8lzzdLagCnO1wATzr7iUFu1dSoVpcFcRaKg==">(),
      true
   );
   private final lliliIIiililiIIi Iiliiillll;
   private static final long llIiiillll = 1000L;
   private final iilliIlIIiliIl llliiillll;
   private final iiIiiilIIliiil liIiiillll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","PBvh7OOGxq/qomTJIPcKcuZ1ucL3QKZGizDWouCt7FzC1VM=">(),
      IliIlllilIi<"IliIlllilIi","5HA3+qRaxXshU3I8OYfog0h4oGaxIwlPJ4eBENYNyyfCs/O+tFyvoCjYuhEDlvJt4Mw=">(),
      true
   );
   private final iiIiiilIIliiil IIliiillll;
   private final iiIiiilIIliiil iIliiillll;

   public static lllllIllillllIll iiiIlIIIll() {
      lllllIllillllIll var0 = (lllllIllillllIll)llilIllililIll.iliIiiliiiii(lllllIllillllIll.class);
      return var0 != null && var0.IliIlllilIi() ? var0 : null;
   }

   private void lIIlliIIll() {
      long var2 = -4978974341079771711L;
      var2 ^= ((long)this.Iiliiillll.Ililllililil() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != liliiillll) {
         liliiillll = (int)(var2 >>> 32);
         IlIllllIll();
      }
   }

   @Override
   protected void Illillliilli() {
      this.iiliiillll.clear();
      this.lIIlliIIll();
   }

   public static boolean lllllillll(class_2680 state) {
      long var3 = -1477059954306550462L;
      var3 ^= ((long)liliiillll << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != 0 && state != null) {
         class_2248 var2 = state.method_26204();
         if (var2 == class_2246.field_10091) {
            return true;
         } else {
            return (int)(var3 >>> 32) < ((-2132847433 - -123 + -11 + -37) * 17 ^ -1898666720)
               ? false
               : var2 instanceof class_2312 || var2 == class_2246.field_10523 || var2 == class_2246.field_10301;
         }
      } else {
         return false;
      }
   }

   private static void IlIllllIll() {
      if (Iiiilllliiilll != null && Iiiilllliiilll.field_1769 != null && Iiiilllliiilll.field_1687 != null) {
         Iiiilllliiilll.execute(() -> Iiiilllliiilll.field_1769.method_3279());
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      this.lIIlliIIll();
      if (this.iiliiillll.size() > 256) {
         long var1 = System.currentTimeMillis();
         this.iiliiillll.values().removeIf(h -> var1 - h[1] > 1000L);
      }
   }

   public lllllIllillllIll() {
      super(IliIlllilIi<"IliIlllilIi","h9FqK4iYHGSfnD2F34v/jx/BXl18qrZtUH2r/nE3uq3Lmy4D411z">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iiIiiillll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","0zJ8XWjbpj6MjXGIzVfAUW4k29vfcssRMqJu+I+7YL6ZG4LBJj/RyOii">(),
         IliIlllilIi<"IliIlllilIi","soaCe0ajk+rg5fCDipWebHV7ygwN6cps1uuCh0x13kZf8FwYJVdgC/M6uXFjrUc5ipeAB2NqfCsFsts9mrQu0u9jSvqM3Gk060A/">(),
         true
      );
      this.IIliiillll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ij57XGUiQwrMRrGOsce1gZuwddZfUhRiW2BYDtcVjw==">(),
         IliIlllilIi<"IliIlllilIi","Hkle8Ty7nve0SWHSbuGZ6B8wUA/xCHOn0nz7FPvD/0j7FqkbgylCNZSMTAYHlf6/">(),
         true
      );
      this.lIliiillll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","sf3BOiOyI5/BFufcToL1BAO5u+GXFtldmtV/QTcyTZilfZoctnA=">(),
         IliIlllilIi<"IliIlllilIi","Rdm+rsf4ZJk9aEkQiCN7vj3AvwvFN+GUpSACtv28HPC12/k0xouNO9vOr/viYnqC9/iqfH5t">(),
         true
      );
      this.iIliiillll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","w+OdEXsAnUGwdMgqgrfoBJ1ZJjGOjlQM7dYhvUmGdhgC8z4+w96R">(),
         IliIlllilIi<"IliIlllilIi","SWg1Hr7RLuImvhiJUg99de0voly10mXVegHfhzWN3qcnpai3TzE01k8BtHuUs7APuE1nYVGUIXLQuzTFKIEkx/5Vj2WLIhkdxA==">(),
         true
      );
      this.Illiiillll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ghuHQRcLuQpiKxPUfbkRFVZTWfnOLTpwI6zSSjgJdwYJ0g==">(),
         IliIlllilIi<"IliIlllilIi","vphMUEAuuSQqZD3i7qi+/hlaHMFXsZP7XXRFl4OT+mU5I1Y6fuxvtMD6SKJLhIfhzxByfKpzlKIw9I7i15TPElzZvAsghIc6ZktQxisuQY3QBtWQ7zE6OcTxq3MKygYNwBcARprK/YsgMkY7">(),
         true
      );
      this.llliiillll = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","wMNab9hfFqIEOcMSqZWLbY/LvYhxxcgpaEvQgIo/K8luj4v+iiQ=">(),
         IliIlllilIi<"IliIlllilIi","ksT23I5qmbKbIm4HTR0DB1Ui1P+iUkemSKKQ9m8ryEgfVMU5sRLmafEko1vA6jC0dH169+aF5NSSleiLwKD7yZXoyENR+V0epjKzN0Hjm7revxegJJcRlR4ABGLLEF6QsH0s7SJVEjHXvQ==">(),
         5,
         1,
         20
      );
      this.illiiillll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","NFwX19qw3+EA/eZt7RC4Xq+eS3iLCy2ghm3FVqeNgmIRoEA=">(),
         IliIlllilIi<"IliIlllilIi","9KTSEftDOSva+cWfcSfB0OwAGeSAl1H9ayUSyQdiFvhztJM3AEyvmaRWrSKvKzNvW6Tguq1KtzcjfJcHZGhyR1SbxcY3CDEI2hRLp58wfCgFFRtNPP4RSpdfRVTWiHhYfsdpOlYtn/Tpd58=">(),
         true
      );
      this.Iiliiillll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","AECmBos7Zr2f1zSZ6CZDPBeAq0fzg++lslo63YvfUwSe/evp">(),
         IliIlllilIi<"IliIlllilIi","rejFE6+gWkbJMqrrEq1ylh/rPCxdenRrt7Re6WBAqD7TPM8ux93QcHej8ope8XmE/IgRxfSAOwFi5o+KSiQjQL1jPcajS5nOxEnv/2/1SDXL4sKWW6jKa9su7RQcrF/lBSLuslu5Tj5tFC3xxh4+">(),
         IliIlllilIi<"IliIlllilIi","7sT6tbm350ifsn6MtpEyDukvivyrb5t/5FJwAYmybQ==">(),
         IliIlllilIi<"IliIlllilIi","lfqGEMZ6N0DziBxm1UKYGliJvMNWrq18bHj8mTKn5w==">(),
         IliIlllilIi<"IliIlllilIi","1Lc52vWfIe6viLANCQ1Ee6wJJ1zz3R3c8bstyTivwpM=">(),
         IliIlllilIi<"IliIlllilIi","7sT6tbm350ifsn6MtpEyDukvivyrb5t/5FJwAYmybQ==">()
      );
      this.iiliiillll = new ConcurrentHashMap<>();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IiIiiillll,
            this.liIiiillll,
            this.iiIiiillll,
            this.IIliiillll,
            this.lIliiillll,
            this.iIliiillll,
            this.Illiiillll,
            this.llliiillll,
            this.illiiillll,
            this.Iiliiillll
         }
      );
   }

   @Override
   protected void Iilililiiili() {
      this.iiliiillll.clear();
      if (liliiillll != 0) {
         liliiillll = 0;
         IlIllllIll();
      }
   }

   public boolean IIllllIlll() {
      return this.iIliiillll.Iilllilliill();
   }

   public boolean ilIllIiIll(class_1297 entity) {
      if (entity instanceof class_1542) {
         return this.IiIiiillll.Iilllilliill();
      } else if (entity instanceof class_1303) {
         return this.liIiiillll.Iilllilliill();
      } else if (entity instanceof class_1540) {
         return this.iiIiiillll.Iilllilliill();
      } else {
         return entity instanceof class_1541 ? this.IIliiillll.Iilllilliill() : false;
      }
   }

   public boolean iIlllIllll() {
      return this.illiiillll.Iilllilliill();
   }

   public boolean Iillllilll(class_1113 sound) {
      if (this.Illiiillll.Iilllilliill() && sound != null) {
         class_3419 var2 = sound.method_4774();
         class_2960 var3 = sound.method_4775();
         if (var3 == null) {
            return false;
         } else {
            boolean var4 = var2 == class_3419.field_15247
               && var3.method_12832().startsWith(IliIlllilIi<"IliIlllilIi","g3bf2DrdwLbSMzsopH4AGHcoiO9roGXUEaKqbcxoNU1EZaOvtxKzE18gf30=">());
            if (var4
               || var2 != class_3419.field_15250
                  && var2 != class_3419.field_15253
                  && var2 != class_3419.field_15247
                  && var2 != class_3419.field_61058
                  && var2 != class_3419.field_15246) {
               long var5 = System.currentTimeMillis();
               long[] var7 = this.iiliiillll.computeIfAbsent(var3, now -> new long[]{var5, 0L, 0L, 0L});
               synchronized (var7) {
                  if (var5 - var7[1] > 1000L) {
                     var7[0] = var5;
                     var7[2] = 0L;
                     var7[3] = 0L;
                  } else if (var5 - var7[0] > 1000L) {
                     var7[0] = var5;
                     var7[2] = 0L;
                  }

                  var7[1] = var5;
                  var7[2]++;
                  if (var7[2] > (long)this.llliiillll.Iilllilliill()) {
                     var7[3] = 1L;
                  }

                  return var7[3] != 0L;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean liIlliiIll() {
      return this.lIliiillll.Iilllilliill();
   }
}
