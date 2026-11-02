package gg.corz;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public record lIIIlliIIIll(float yaw, float pitch, class_243 landing, class_2338 stand, int flight, List<class_243> arc) {
   private final class_2338 IiiIIiilliiIIiil;
   private final float iIiIIiilIliIIiil;
   private final int iiiIIiilIIIlIiil;
   private final float IIiIIiillIiIIiil;
   private final List<class_243> lIIlIiiliIIlIiil;
   private final class_243 lliIIiililiIIiil;

   public class_2338 IilliliilIIi() {
      return this.IiiIIiilliiIIiil;
   }

   public lIIIlliIIIll(float yaw, float pitch, class_243 landing, class_2338 stand, int flight, List<class_243> arc) {
      this.IIiIIiillIiIIiil = yaw;
      this.iIiIIiilIliIIiil = pitch;
      this.lliIIiililiIIiil = landing;
      this.IiiIIiilliiIIiil = stand;
      this.iiiIIiilIIIlIiil = flight;
      this.lIIlIiiliIIlIiil = arc;
   }

   public float liiiIIllIl() {
      return this.iIiIIiilIliIIiil;
   }

   public class_243 iIlIlllllill() {
      return this.lliIIiililiIIiil;
   }

   public List<class_243> iliIiiliiiii() {
      return this.lIIlIiiliIIlIiil;
   }

   public float IliIlllilIi() {
      return this.IIiIIiillIiIIiil;
   }

   public int lIiiIiIlilli() {
      return this.iiiIIiilIIIlIiil;
   }
}
