package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.util.function.Supplier;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class lIiilllliIiillll {
   private String llliliIill;
   private int liIiliIill;
   private String IlliliIill;
   private int IIliliIill;
   private static final String iiilliIill = "Pick a schematic, place it, then press Start.";
   private static final int llilliIill = 4;
   public static final int IlilliIill = 44;
   private int IiIiliIill;
   private static final Color iIIiliIill = new Color(-7630437, true);
   private static final int ililliIill = 18;
   private int lIliliIill = -1;
   private final lIIiiIiiIIiiIi ilIiliIill;
   private static final String IIIiliIill = "Add trades, mark your chests, then press Start.";
   private final String llIiliIill;
   private static final float liilliIill = 0.82F;
   private static final String lIIiliIill = "Compare /ah shard tool deals and buy the best one.";
   private String iIliliIill;
   private static final int IiilliIill = 24;
   private int iiIiliIill;
   private final iIlIilIlIllIilIl IlIiliIill;

   private Integer iliIiiliiiii() {
      return this.IlIiliIill.IliIlllilIi() && this.IlIiliIill.iiililliIl.lIiiIiIlilli() != null ? -8393375 : 0;
   }

   private String lIiiIiIlilli() {
      long var8 = 1245727200937773840L;
      long var10 = -1616924223246928569L;
      iIilliIlIlilliIl var1 = this.IlIiliIill.iiililliIl.lIiiIiIlilli();
      String var2 = this.IlIiliIill.iiililliIl.iliIiiliiiii();
      var8 ^= ((long)(var1 != null ? 1 : 0) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(this.IlIiliIill.IliIlllilIi() && (int)(var8 >>> 32) != 0 ? 1 : 0) ^ var8) & -1L >>> 32;
      var10 ^= ((long)((int)var8 != 0 ? IiIlIiIiliIlIiIi.IIillIiliIil() : -1) << 32 ^ var10) & -1L << 32;
      String var6 = ((int)(var8 >>> 32) != 0 ? var2 + IIlllIlliIll<"IIlllIlliIll","2E/cAXvpbldeiB6yCwsLfw3sdSySCrhOR3SLu5g=">() + var1.iliIiiiIll : "")
         + IIlllIlliIll<"IIlllIlliIll","2E/cAXvpbldeiB6yCwsLfw3sdSySCrhOR3SLu5g=">()
         + (int)(var10 >>> 32);
      if (!var6.equals(this.IlliliIill)) {
         this.IlliliIill = var6;
         if ((int)(var8 >>> 32) == 0) {
            this.llliliIill = IIlllIlliIll<"IIlllIlliIll","1ali99xSxH8i97dYfOjqpV5rL8MQuXNsftuFzrQDnNQJ69StnSxMNR29Y2l8PR0=">();
         } else {
            String var7 = var2 != null && !var2.isBlank()
               ? Iiiiliiiiiii.iilllIIill(var2)
               : (
                  var1.iliIiiiIll != null && !var1.iliIiiiIll.isBlank()
                     ? var1.iliIiiiIll
                     : IIlllIlliIll<"IIlllIlliIll","hAwmui9cObIH1GwHmyR/SeGXoe5R9yVnqh8Z1e1mexeV66HC6g==">()
               );
            this.llliliIill = (int)var8 != 0
               ? var7
                  + IIlllIlliIll<"IIlllIlliIll","na7JwaudvLuml6YkpKOvUDxwqLBBO/zzEY43qnfvVvW7rQ==">()
                  + (int)(var10 >>> 32)
                  + IIlllIlliIll<"IIlllIlliIll","XY2yF2u3DGKI/zOkr0ti+JZH3k8ZCZwUERzURog=">()
               : var7;
         }
      }

      return this.llliliIill;
   }

   public boolean IilliliilIIi(double mx, double my, int button) {
      return this.ilIiliIill.lIiiIiIlilli(mx, my, button);
   }

   private lIiilllliIiillll(String tip, String act, String label, Runnable desc, Supplier<String> status, Supplier<Integer> dot) {
      this.llliliIill = "";
      this.IlIiliIill = null;
      this.llIiliIill = tip;
      this.iIliliIill = tip;
      this.IIliliIill = 44;
      ililliIiIiilliIi var7 = new ililliIiIiilliIi(act, label, act, desc).IIillIiliIil(status).IIIilIIiiIIi(dot);
      this.ilIiliIill = new lIIiiIiiIIiiIi(var7, 0, 0, 0, 24);
   }

   public void liiiIIllIl(int height, int width, int x, int y) {
      this.IiIiliIill = height;
      this.liIiliIill = width;
      this.iiIiliIill = x;
      this.IIliliIill = y;
      this.ilIiliIill.IIIllIIliIIl(height, width + 18, x, 24);
   }

   public static lIiilllliIiillll IliIlllilIi(ilIllIiIll m) {
      if (m instanceof iIlIilIlIllIilIl var3) {
         return new lIiilllliIiillll(var3);
      } else if (m instanceof llIiIlilIiIl var2) {
         return new lIiilllliIiillll(
            IIlllIlliIll<"IIlllIlliIll","DJOxnn59g9/LlOFrZaw8zrZf92Whvfo1UKwMeuyLWi/PZgCbdZj353XY1rZy+9rTo4SO8tXodTSJtOhv+oVO5tO94JR6UdZtlRJ4">(),
            IIlllIlliIll<"IIlllIlliIll","frXZYcZWt3aWouWWg4cvNV+JbtoCE3igaHDP8dHvvrlZEu7M6zmc">(),
            IIlllIlliIll<"IIlllIlliIll","gNPSnqa3/EZ/tWKewe8mnv3Z8ByEkbrC4MwFd8EhzGhIlwF78tmvD8vtokvrv0JRDLCDqw==">(),
            () -> iIIiIIIlIlIiIIIl.IIllllIlll(var2),
            var2::iIllilIlllil,
            var2::llllililllil
         );
      } else {
         return m instanceof IIlilIllIlilIl var1
            ? new lIiilllliIiillll(
               IIlllIlliIll<"IIlllIlliIll","CsSAvA5pBC7yYNr+LetxBTdJXaBLvZI1rSOJ3Qgqh21b/pfZJk9ukF1JnmoqiFEpIaDBa/AdkxZXrw2vACIO83EO6cc42N03Al6uSuo+">(),
               IIlllIlliIll<"IIlllIlliIll","P53PQuIDj/boixlmbBiFiWLB9mCX2B+Mer6amJAQERr71jVmfjB47Sqq1A==">(),
               IIlllIlliIll<"IIlllIlliIll","hhvGO8lgE5Ovrzp88LfoZxFVHUdFIs3uEqngdApa++92kRovakgLKcTbCIzmosw=">(),
               () -> llIIlIllilIIlIll.IIllllIlll(var1),
               var1::illiIlIiliIl,
               var1::liliIliiliIl
            )
            : null;
      }
   }

   public void iIlIlllllill(class_332 ctx, int mouseY, int mouseX) {
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      if (this.iiIiliIill != this.lIliliIill) {
         this.lIliliIill = this.iiIiliIill;
         this.iIliliIill = var4.Iiilliiliiil(this.llIiliIill, (float)(this.iiIiliIill - 8) / 0.82F);
      }

      class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
      var5.method_22903();
      var5.method_22905(0.82F, 0.82F, 1.0F);
      var4.IliIlllilIi(this.iIliliIill, (float)(this.IiIiliIill + 4) / 0.82F, ((float)this.liIiliIill + 2.0F) / 0.82F, iIIiliIill);
      var5.method_22909();
      this.ilIiliIill.IIIllIIliIIl(this.IiIiliIill, this.liIiliIill + 18, this.iiIiliIill, 24);
      this.ilIiliIill.liiiIIllIl(ctx, mouseY, mouseX);
   }

   private lIiilllliIiillll(iIlIilIlIllIilIl builder) {
      this.llliliIill = "";
      this.IlIiliIill = builder;
      this.llIiliIill = IIlllIlliIll<"IIlllIlliIll","WLsHYRXRmXa8i8ODYqoA8xZJtWc753/YvWX3/PQo/ceDlWNxrm1n9YIMSO/7IxUWSAG3XX+nS9V4DlSYIOdXtdDcqqxebqeI5Q==">();
      this.iIliliIill = IIlllIlliIll<"IIlllIlliIll","WLsHYRXRmXa8i8ODYqoA8xZJtWc753/YvWX3/PQo/ceDlWNxrm1n9YIMSO/7IxUWSAG3XX+nS9V4DlSYIOdXtdDcqqxebqeI5Q==">();
      this.IIliliIill = 44;
      ililliIiIiilliIi var2 = new ililliIiIiilliIi(
            IIlllIlliIll<"IIlllIlliIll","uZ1nFOw+grFCxWxsjkohVPC0o3/QCyhMFh1J6xhAu8+JizxZg5f8EQ==">(),
            IIlllIlliIll<"IIlllIlliIll","x+IzeOvfddgDfCxsLDzfauaW6TL5RBLViLiLN66QWDdrP39+Nrnf/fv1ZkLpmaXGWg==">(),
            IIlllIlliIll<"IIlllIlliIll","uZ1nFOw+grFCxWxsjkohVPC0o3/QCyhMFh1J6xhAu8+JizxZg5f8EQ==">(),
            () -> IIIIllIIIl.Iiliililii(builder)
         )
         .IIillIiliIil(this::lIiiIiIlilli)
         .IIIilIIiiIIi(this::iliIiiliiiii);
      this.ilIiliIill = new lIIiiIiiIIiiIi(var2, 0, 0, 0, 24);
   }
}
