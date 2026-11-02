package gg.corz;

import java.util.concurrent.LinkedBlockingDeque;

final class iilIlIliIIiIlIli extends LinkedBlockingDeque<Runnable> {
   public boolean offer(Runnable r) {
      return this.offerFirst(r);
   }
}
